# UC
This is a unit converter that converts between the height between random objects
  I came up with this idea when I came across a comparison of Shaquille O'Neill's height to the Empire State Building. So I decided to make a converter that compared random small objects to large monuments across the world.  
  I implemented this project on Android Studio. I mapped different units to each other by creating a Converter class with an unit enum so that we could use switch statements to figure out the multiplier value. I used two Spinners, one for small objects and one for large objects, to allow the user to choose the units in a cleaner way.
  I used several websites to build the basic structure but to implement it the way I wanted to, required a lot of trial and error on my part. Fun Converter is a little more complex because I am not taking in user input so the values are stored in the code itself. The hardest part was finding a way to convert the values between two spinners and to have enums that were two words. I learned a lot about how each files works with each other. As a result, I chose to write the values of the spinners in the strings.xml file because it is easier for the list to be translated into another language rather than have an array of strings the MainActivity.java file. 

Day 1: Learning how to make a Spinner
Day 2: Make a basic unit converter with inches, feet, yards, etc
Day 3: Researched fun things to compare and convert
Day 4: Apply Fun Converter to the basic converter
Day 5: Apply Fun Converter to the basic converter
Day 6: Apply Fun Converter to the basic converter
Day 7: Fix errors: convert method not working
Day 8: Fix errors: trying to figure out how to make a string with spaces into enum, Finish!
