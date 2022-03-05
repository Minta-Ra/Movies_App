# Movie Time

### Description:
Mobile movie application group project that was built using React Native and Expo front end and Java backend. This app allows users to add movies that they have seen to their favorites and movies that they want to watch can be added to their watchlist under their profile. Users can also get movie recommendations according to users' saved movies in favorites. Testing was implemented using Unit and Spring Boot tests.
#

### This project was created using: 
| Back-end | Front-end |
| :------- | :-------- |
| Java | React Native |
| Spring (Spring Web, Spring Boot) | Expo |
| Spring Data JPA |
| H2 Database |
| Unit Test |


### MVP Acceptance Criteria:
* View a list of popular movies
* Search for a movie by name
* View movie information
* Add/remove a movie to/from my watchlist
* Add/remove a movie to/from my favourites
* View/edit user's information

### Potential Extensions:
* User to be able to create an account
* User to be able to login / logout
* Display movie recommendations
* Ability to rate movies
* Ability to add/remove friends
* View my fiend's favourites

### Additional Extensions:
* Include TV shows
* TV show has seasons and episodes

### Undertaken and tackled risks:
Learning React Native framework might take time and add extra complexity.

### To try this application:
Install on your machine expo using terminal `npm install --global expo-cli`
Open /server using intelliJ IDE
Run 'ServerApplication'
Open /client using Visual Studio Code
In /services create a new file "local_ip.js" and write `export const ip = "{Your own IPv4 Address}";` (Needed so your phone knows to connect to your computer's localhost)
In /services create a new file "apikey.js" and write `export const apikey = "{Your own Api Key}";`
In /client root folder run `npm install`
Then from /client in terminal run `expo start`
Follow the terminal suggestions to open the simulator
Use login details, email: example@example.com, password: 888