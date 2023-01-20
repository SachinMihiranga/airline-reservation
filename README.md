# Airline Reservation System 

![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/madushas/airline-reservation/docker-image.yml)
[![Libraries.io dependency status for GitHub repo](https://img.shields.io/librariesio/github/madushas/airline-reservation)](https://libraries.io/github/MadushaS/airline-reservation)
[![GitHub issues](https://img.shields.io/github/issues/madushas/airline-reservation)](https://github.com/madushas/airline-reservation/issues)
[![DeepSource](https://deepsource.io/gh/MadushaS/airline-reservation.svg/?label=active+issues&show_trend=true&token=nn1OYtL-R9ZnXO7bJQmapzzD)](https://deepsource.io/gh/MadushaS/airline-reservation/?ref=repository-badge)
![GitHub](https://img.shields.io/github/license/madushas/airline-reservation)
[![Website](https://img.shields.io/website?label=Live-demo&up_message=online&url=http%3A%2F%2Fmyplods.herokuapp.com%2F)](http://myplods.herokuapp.com/)
![Uptime Robot ratio (30 days)](https://img.shields.io/uptimerobot/ratio/m793515192-1e0ed5bd4c491afc85c8b1ab)

![GitHub Repo stars](https://img.shields.io/github/stars/madushas/airline-reservation?style=social)
![GitHub forks](https://img.shields.io/github/forks/madushas/airline-reservation?style=social)

Airline reservation system is a full-stack Java application. 
Technologies that use to project;

- Java/MVN  + Spring boot + MVC Architecture
- HTML, Tailwind CSS, JS
- Spring Security, Auth0
- Intellij IDEA, VS Code
- MongoDB
- Docker
- Git/GitHub


# Setup

### To run the app,

- Clone this repo to your local machine using
```git
git clone https://github.com/MadushaS/airline-reservation.git
```
- Connect database 
1. install mongodb on your system
1. Start the server, run mongosh on command-line
1. create a databese
1. get connection string of your database.
1. put connection string infront of `spring.data.mongodb.uri` in `src/resources/application.properties`

- Run `AirlineReservationApplication.java` in `src/main/java/AirlineReservationApplication.java`


# Spring Boot 2 Login - MVC

This sample demonstrates:

- Adding authentication with Auth0 to a Spring Boot 2 MVC application
- Accessing profile information of the authenticated user
- Only allowing authenticated users to access certain resources

## Configuration

### Auth0 Dashboard
1. On the [Auth0 Dashboard](https://manage.auth0.com/#/clients) create a new Application of type **Regular Web Application**.
1. On the **Settings** tab of your application, add the URL `http://localhost:3000/login/oauth2/code/auth0` to the **Allowed Callback URLs** field.
1. On the **Settings** tab of your application, add the URL `http://localhost:3000/` to the **Allowed Logout URLs** field.
1. Save the changes to your application settings. Don't close this page; you'll need some of the settings when configuring the application below.

### Application configuration

Copy `src/main/resources/application.yml.` to `src/main/resources/application.yml`:

```bash
cp src/main/resources/application.yml.example src/main/resources/application.yml
```

Set the application values in the `src/main/resources/application.yml` file to the values of your Auth0 application.

```yaml
client-id: {YOUR-CLIENT-ID}
client-secret: {YOUR-CLIENT-SECRET}
issuer-uri: https://{YOUR AUTH0 DOMAIN}/
```

### Running the sample

Open a terminal, go to the project root directory and run the following command:

Linux or MacOS:

```bash
./gradlew bootRun
```

Windows:

```bash
gradlew.bat bootRun 
```

The application will be accessible at http://localhost:3000.

### Running the sample with docker

In order to run the example with [Docker](https://docs.docker.com/install/) you need to have `docker` installed.

You also need to set the client values as explained [previously](#application-configuration).

Execute the command to run Docker for your environment:

Linux or MacOS:

```bash
sh exec.sh
```

Windows:

```bash
.\exec.ps1
```

The application will be accessible at http://localhost:3000.

## Issue Reporting

If you have found a bug or if you have a feature request, please report them at this repository issues section. Please do not report security vulnerabilities on the public GitHub issue tracker. The [Responsible Disclosure Program](https://auth0.com/whitehat) details the procedure for disclosing security issues.


## Authors

👤 **Madusha Sandaruwan**

-   Github: [MadushaS](https://github.com/MadushaS)
-   LinkedIn: [madusha_sandaruwan](https://linkedin.com/in/madushasandaruwan)


👤 **Yasindu Sanjeewa**

-   Github: [YSanj98](https://github.com/YSanj98)
-   LinkedIn: [yasindu_sanjeewa](https://www.linkedin.com/in/yasindu-sanjeewa-a79783202)


👤 **Sachin Mihiranga**

-   Github: [SachinMihiranga](https://github.com/SachinMihiranga)
-   LinkedIn: [sachin_mihiranga](https://www.linkedin.com/in/sachin-mihiranga-644608255)


👤 **Omali Fernando**

-   Github: [Omali99](https://github.com/Omali99)
-   LinkedIn: [omali_fernando](https://www.linkedin.com/in/omali-fernando-04723124a)

👤 **Pivindi Nimanga**

-   Github: [nimanga](https://github.com/nimanga-cs19019)
-   LinkedIn: [pivindi_nimanga](https://www.linkedin.com/in/pivindi-nimanga-985713250)


👤 **Dulana Dewmin**

-   Github: [DulanaDewmin](https://github.com/DulanaDewmin)
-   LinkedIn: [dulana_dewmin](https://www.linkedin.com/in/hewa-dehigahawaththage-dulana-dewmin-0788b21b9)


---
