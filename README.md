#spring boot websphere liberty

##Build
docker build -t spring-boot-websphere-liberty -f Dockerfile .
## Run
docker run --name spring-boot-websphere-liberty -e LICENSE=accept -p 9888:9080 -p 9889:9443 spring-boot-websphere-liberty

## Rest Call
Open the browser and hit the following url to invoke the service.

http://192.168.99.100:9888/spring-boot-deploy-websphere-liberty-0.0.1/person?firstName=arun&lastName=duraisamy