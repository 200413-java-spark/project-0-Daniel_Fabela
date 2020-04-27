package com.github.danielfabela.partpicker.components;

public class ComponentsFactory {
    private static ComponentsFactory instance;

	private ComponentsFactory() {
	}

	public static ComponentsFactory getInstance() {
		if (instance == null) {
			instance = new ComponentsFactory();
		}
		return instance;
	}

	public Components getComponents(String Part, String Model, String sPrice) {
		switch (Part) {
			case "cpu":
				return new Cpu(Part, Model, sPrice);
			case "moth":
				return new Moth(Part, Model, sPrice);
			case "gpu":
				return new Gpu(Part, Model, sPrice);
			case "ssd":
				return new Ssd(Part, Model, sPrice);
			default:
				throw new IllegalArgumentException("Component not currently in Stock");
		}
	}
}