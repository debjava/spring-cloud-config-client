## spring-config-client
An example on Spring Cloud Config along with Config Client application name. Refer app-config project in github.

If the directory structure is like this

````
app-config
    - integration
        - your-application-name
            -application-{profile-name}.properties

````
In the config client, you have to use like this
````
spring.application.name=business-service
spring.profiles.active=integration
````

In the config server, you have to use like this

````
cloud.config.server.git.clone-on-start=true
spring.cloud.config.server.git.default-label=develop
spring.cloud.config.server.git.uri=https://gitlab.ddlab.com/business/services/products/ddlab/ddlab-app-config.git
spring.cloud.config.server.git.search-paths=integration/business-service <== profile-name/app-directory-name

````

## Motivation
To be updated Later

## Build status
To be updated later

## Screenshots
To be updated later

## Technology Stack
To be updated later

## Features
To be updated later

## Installation
To be updated later

## How to use?
To be updated later

## Contributor

**debad**

## License
A free and open source project.
MIT © [debad]()