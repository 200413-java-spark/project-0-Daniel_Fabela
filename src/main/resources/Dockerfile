FROM postgres
ENV POSTGRES_USER pclist
ENV POSTGRES_PASSWORD pclist
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432