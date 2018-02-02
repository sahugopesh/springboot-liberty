#FROM websphere-liberty:javaee7
FROM websphere-liberty

MAINTAINER Arun Duraisamy <arun4.duraisamy@gmail.com>
RUN mkdir -p /tmp/db/migration

COPY target/classes/db/migration /tmp/db/migration
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/
COPY target/spring-boot-deploy-websphere-liberty-0.0.1.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/

RUN installUtility install --acceptLicense defaultServer