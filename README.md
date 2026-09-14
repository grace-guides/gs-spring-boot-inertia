[![Main branch build status](https://github.com/grace-guides/gs-spring-boot-inertia/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-guides/gs-spring-boot-inertia/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Grace Document](https://img.shields.io/badge/Grace_Document-latest-blue?style=flat&logo=asciidoctor&logoColor=E40046&labelColor=ffffff&color=f49b06)](https://guides.graceframework.org/gs-spring-boot-inertia/1.0.x/)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://x.com/graceframework)

[![Groovy Version](https://img.shields.io/badge/Groovy-3.0.23-blue?style=flat&color=4298b8)](https://groovy-lang.org/releasenotes/groovy-3.0.html)
[![Grace Version](https://img.shields.io/badge/Grace_Inertia-0.5.0-blue?style=flat&color=f49b06)](https://github.com/grace-plugins/grace-inertia/releases/tag/v0.5.0)
[![Spring Boot Version](https://img.shields.io/badge/Spring_Boot-2.7.18-blue?style=flat&color=6db33f)](https://github.com/spring-projects/spring-boot/releases/tag/v2.7.18)

# Spring Boot Application with Inertia.js

Using the Grace adapter for Inertia.js, support both Grace framework and Spring MVC.

## Versions

* Spring Boot 2.7.18
* Groovy 3.0.23
* Grace Inertia 0.5.0


### Adding Grace adapter for Inertia.js

```gradle

dependencies {
    implementation 'org.graceframework.plugins:grace-inertia:0.5.0'
    ...
}

```

### Running the application

```bash
$ ./gradlew bootRun

// Open another terminal
$ npm run serve
```


## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Guides](https://github.com/grace-guides)
- [Grace Inertia](https://github.com/grace-plugins/grace-inertia)
