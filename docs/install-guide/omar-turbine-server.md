# OMAR Turbine Server

## Dockerfile
```
FROM omar-base
COPY omar-turbine-server-1.0.0-SNAPSHOT.jar /usr/share
VOLUME /dev/random /home /Users
EXPOSE 8761
CMD java -Xms256m -Xmx1024m -Dspring.profiles.active=production -Djava.security.egd=file:/dev/./urandom -Dserver.contextPath=/omar-turbine-server -jar /usr/share/omar-turbine-server-1.0.0-SNAPSHOT.jar
```
Ref: [omar-base](../../../omar-base/docs/instal-guide/omar-ossim-base/)

## JAR
`http://artifacts.radiantbluecloud.com/artifactory/webapp/#/artifacts/browse/tree/General/omar-local/io/ossim/omar/apps/omar-turbine-server`
