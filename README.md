# iebis_swdev_exam_architecture
Series Scrapping is a new application that wants to rock it helping their users to be updated about the last news regarding their favourite TV Shows.

The main feature of this application is that enable users to follow the TV Shows that they love. Whenever a new chapter is released, the users that follow the related TV Show are notified so they are aware of it.

The lead developer of your team have asked you to implement the architecture of this feature. To ease you things he is giving you the main classes that you have to use:

* Main: This class acts as a helper since it gives you a basic view of the functioning of the system and help you to figure out which methods at least you should implement in the other classes. It's an example itself and you should change it as little as possible.
* Show: This class represents a given TV Show.
* Season: This class represents a season inside a Show. A Show could have as many seasons as the real TV Show does.
* Episode: This class represents a single episode. An Episode always belong to an specific Season. A Season, therefore can have multiple Episodes.
* User: This class represents the User.

The lead developer, since he knows that you master Design Patterns, asks you a couple of tasks:

## Implement an Observer pattern (3 points)

You know that you could tie the Show class to the User in order to notify when a new episode is available, but the real thing is than that will be a security issue since Show will be able to know the age, gender, city address and other personal information of the class User.

To avoid that, *you are asked to implement the Observer Pattern so Users can subscribe to any Show*. Using this pattern, you will stablish a communication system in between of those two classes but using an Interface in a way that will make Show not need to know any specific details of the class User.

Once the User is subscribed to a Show, using that pattern, if a new episode is released or a full season is available overnight, the User should receive some kind of notification.

## Implement a Builder pattern (1 point)

A while ago, somebody implemented an User class so we already have some code available. But the truth is that the code that somebody else made was dirty and really unpleasant to reuse.

The previous application gathered a lot of info related with the User, but since the release of the GDPR we prefer to ask as little as possible to the users. 

To avoid that ugly constructor, *you are in charge of retrofitting the whole User class implementing a Builder pattern*.
Do it in a way that your only mandatory field will be the name of the user, but giving the flexibility to create an User that can have other fields, like the ones that appear in the actual class, just in case, for the future.

======================================================================

# Instructions
1. Implement or modify the code of the given classes, and other classes that you may need to create, in order to build the desired patterns.
2. In *Main.java* you should make modifications only in two places:
* Delete the line where "Angelica" user is created, since you are going to use the Builder pattern now. Add as many lines that you need to create again the User with the new pattern.
* Look inside the comments where you are asked to subscribe "Angelica" to "Game of Thrones". Add the needed lines there to make her subscribe to that show.
3. Once an User receives a notification, you should print on the screen a message of this kind: "Angelica, the episode DADADA from the TV Show WHATEVER is available. In the HINTS section below you will find an example.

# Instructions to get the code and present it
1. Up in the GitHub interface you will see a *Fork* button. Click it and choose your account. This will create a copy of this project on your GitHub account.
2. Go to your recently copied project (make sure your user name appear in front of the name of the project).
3. Clone your project into your workspace.
4. Make any modifications to fulfill the requirements in your workspace unsing IntelliJ.
5. Commit your changes.
6. Push it to origin: "git push origin".
7. Add "*Chezlui*" as a collaborator to your project.

## Rules to consider
1. You are free to use Internet to consult resources.
2. *Push any code before the deadline*. Any code presented after the deadline will be scored as 0. Better upload something early than perfect late.
3. Score will take into account not only working code, but also how it has been structured and if you have followed good practices.

## Hints
Start creating the missing constructors of the different classes to clean some of the Warnings in Main.java
Then create the scaffolding to make Show contains Seasons and these, contain Episodes.
Then you will feel comfortable to move to implement the patterns.
Once your code is working, if you run the example contained in *Main.java* the expected ouput in the console should be:
```
Angelica, the episode The making of Season 1 from the TV Show Game of Thrones is available
------------- One year has passed -------------
Angelica, the episode The North remembers from the TV Show Game of Thrones is available
Angelica, the episode The Night Lands from the TV Show Game of Thrones is available
Angelica, the episode What is Dead May Never Die from the TV Show Game of Thrones is available
Angelica, the episode Garde of Bones from the TV Show Game of Thrones is available
Angelica, the episode The Ghost of Harrenhal from the TV Show Game of Thrones is available
Angelica, the episode The Old Gods and the New from the TV Show Game of Thrones is available
Angelica, the episode A Man Without Honor from the TV Show Game of Thrones is available
Angelica, the episode The Price of Winterfell from the TV Show Game of Thrones is available
```

