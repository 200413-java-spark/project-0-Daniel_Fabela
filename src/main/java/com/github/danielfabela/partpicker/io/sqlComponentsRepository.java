package com.github.danielfabela.partpicker.io;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.github.danielfabela.partpicker.components.Components;
import com.github.danielfabela.partpicker.components.ComponentsFactory;

public class sqlComponentsRepository implements Dao<Components> {
    private sqlDataSource dataSource;
	private List<Components> cache;

	public sqlComponentsRepository(sqlDataSource dataSource) {
		this.dataSource = dataSource;
		cache = new ArrayList<>();
	}

	@Override
	public void writeAll(List<Components> components) {
		String sql = "insert into components(Part, Model, Price, Taxes, Total) values(?, ?, ?, ?, ?)";
		try (Connection connection = this.dataSource.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			for (Components PCparts : components) {
				statement.setString(1, PCparts.getPart());
				statement.setString(2, PCparts.getModel());
                statement.setString(3, PCparts.getPrice());
                statement.setDouble(4, PCparts.getTaxes());
                statement.setDouble(5, PCparts.getTotal());
				statement.addBatch();
			}
			statement.executeBatch();
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Override
	public List<Components> File_Read() {
		if (cache.isEmpty()) {
			ComponentsFactory factory = ComponentsFactory.getInstance();
			String sql = "select * from components";

			try (Connection connection = this.dataSource.getConnection();
					Statement statement = connection.createStatement();
					ResultSet rs = statement.executeQuery(sql);) {
				while (rs.next()) {
					Components PCpart;
					String Part = rs.getString("Part");
					String Model = rs.getString("Model");
                    String sPrice = rs.getString("Price");
                    double taxes = rs.getDouble("Taxes");
                    double total = rs.getDouble("Total");
                    PCpart = factory.getComponents(Part, Model, sPrice);
                    PCpart.setTaxes(taxes);
					PCpart.setTotal(total);
					cache.add(PCpart);
				}
			} catch (SQLException ex) {
				System.err.println(ex.getMessage());
			}
			return cache;
		} else {
			return cache;
		}
	}
}