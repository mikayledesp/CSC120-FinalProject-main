# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
  Alanna Reflection: 
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
    Overall we focused on looking at the big picture first, before getting caught up in the details. We have collaborated as a team before and one of our struggles was coding too early without proper planning. This time around, we focused on planning - writing in words, drawing diagrams, psuedocode, etc. all before working in VScode. 

 - What **new thing(s)** did you learn / figure out in completing this project?
    I learned about graphs and how to use graphs in Guava. 

 - Is there anything that you wish you had **implemented differently**?
    I wish we had been able to use more general methods for our Artifacts. We wrote Examine and Steal methods for each individual artifact because they depended on the room. We were not sure how to effectively simplify the code, but doing so would help condense our code. 

 - If you had **unlimited time**, what additional features would you implement?
    I would have added more graphics. Our map pop-up made the game more fun and exciting for players. In an ideal world, we could have added graphics for each of the Artifacts that appear with the Examine method. 

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
    The most helpful piece of feedback we received was from Mikayle's friends. As they were testing out the game, they recommended that we cut down on player typing by making user input phrases shorter. After implementing this, players seem to enjoy the game far more because they are not bored by having to repetively correct typos. 

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
    I would say to start working early and start small. I think my biggest struggle is getting overwhlmed with the code at the beginning and then procrastinating. I would say to first plan on paper and then code. But, if I begin to struggle with the code, rather than giving up, moving back to paper and seeing if I can figure it out. I also would tell my past self to go to Office Hours and TA hours more, as always. 

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
    I think our team worked well together. At the start of the project we focused on working together - coming up with ideas and outlining our tasks. We also collaborated on the initial set-up of the Rooms. After the base of the code was finished, we split off and each worked on three individual rooms. We would collaborate as bugs occured or as we needed help. I think this team structure worked super well because we could collaborate on the general Museum but each of our individual Rooms featured different methods and tricks for the player. It was fun to see the differences in our rooms but see how they function together. 


Mikayle Reflection: 
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
   Our overall aproach was to plan everything out in psudeo code and try to outline what our plan of attack was. That way we could have the methods sem-thought out before actually writing them. 

 - What **new thing(s)** did you learn / figure out in completing this project?
   I learned how to implement graphics and used them to implement the map feature in the game!

 - Is there anything that you wish you had **implemented differently**?
  I  wished we could've figured out how to make more of the if statements into methods so that our code could be a little shorter and more concise.

 - If you had **unlimited time**, what additional features would you implement?
 If I had unlimited time, I wouldve implemented graphics everytime the user examines the objects to give a more interactive and visual touch to the game. This also couldve been an neat feature to apply to the actual opponents in the game, like having the dinosaur actually appear in a window and react to the different attacks that occur.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 The most helpful feedback I got was from Lucy(120 peer)! They recommended that we also added the option to enter numbers in for the directions so the player didn't have to input the entire dicrection everytime. When I was having my friend Fia playtest, she also suggested being able to steal objects by just typing the word "steal" instead of having to type out steal + the name of the entire object! This really seemed to be a positive change based on seeing people doing that during demo day.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
  I would warn myself against trying to make the project super elaborate as some features have to get cut in the end to actually complete the project. 

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
 When it came to team work I think we were very efficient. We communicated well to complete our parts of the game asynchronously. The only problem we really had was due to github overwriting the other persons code at times but through communication we were able to get over this barrier! We were able to come together and make a project that feels distinct becuase of the different in-game environments we worked on.

 - Design justification 
 We considered making the rooms there own classes instead of instances of the room class. Ultimately, we are glad we didn't go down that route as we had no idea how to make the rooms as interconnected as we did while having them as instances. While we probably could have figured it out doing that method wouldve required way more methods that could've gotten complicated due to the in-game backtracking.