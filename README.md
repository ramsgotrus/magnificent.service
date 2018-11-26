# Magnificent service

Magnificent service have been created to monitor service and returns the health of the service.The API endpoint handler performs various check including the status of the connections , status of host.This service consist of API which peridically invokes the endpoint to check the health of service instance and the response will be return with Status code and the timestamp in json format which can be easily binded in HTML page.

View have been also created with table to show status count and a graph to show the current percentage of failures in the rolling interval.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

After project have been imported in to Eclipse and run , please browse the index.jsp from the following path  magnificent.service/src/main/webapp/WEB-INF/jsp/ .

Service will start checking health of given url and update the status count and graph.

```
Give examples
```

### Installing

A step by step series of running application in development environment.

Assuming you have created a project in GitHub, these are the steps to import it into Eclipse. First, you have to add the git repository to Eclipse. To do so, first make the git repository view visible in Eclipse from the menu 'Window > Show views > Other > Git > Git Repositories'.

https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse

After importing build the project.

## Built With

* [Java Version]1.8 used
* [Maven](https://maven.apache.org/) - Dependency Management
* [JSTL]Used
* [spring-boot]1.5.9 -Used

## Contributing

Please read [CONTRIBUTING.md](https://github.com/ramsgotrus) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

1.0

## Authors

* **Ram Gotru** - *Initial work* - [RamsGotrus](https://github.com/ramsgotrus)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
