Wireframe Conversion
Introduction
Take a (very) rough wireframe drawing and other provided assets to build the UI for a simple news reader app.

Objectives
 understand the main tenets of Material Design
 build layouts with proper spacing
 use color to improve app design
 translate wireframes into Android designs
Instructions
Plan out the UI
Download all the assets
Review the wireframe
Look at the color scheme at this link https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=3F51B5&secondary.color=80DEEA
Review the other assets
With the rough wireframe as your foundation, using your favorite tool, draw out the three activities for your app. Use the principles discussed in this module when laying out the components.
Make as many annotations as possible, the more you make, the easier it will be to build the layouts in the code.
Note element sizes, spacing, color, approximate font size (small, medium, bold)

Build Resources
Add the color resources from the provided colors.xml to your color resources
Use the provided logo vector file to generate an app icon
Generate other image assets with your
Login Page
Add two edit text views as well as sign in and register buttons
Arrange the buttons, size them, add margins and padding to match the design you built
Add coloring to match your design
In your Kotlin file, add a simple listener to the sign in button to launch a second activity
List Page
In order to limit the amount of code we have to write for this mockup, we're going to use a scrollview and some imageviews to layout out this page. In a real app, you'd use a recycler view for this.

Build a top level scroll view with nested view groups and image views to place the images where they belong. Mix in some double wide images for variety.
You can add titles to the images as well to improve your UI

Adjust spacing to match the principles taught as well as your design
Add a listener to each of the imageviews to move to a detail view
This can be done by writing a single method and passing it an image to add to the intent

Detail Page
Build the detail page with an imageview, title text and body text. This will need to scroll to allow for larger bodies of text.
Remember to use margins, key lines and to count the number of characters in your text block to get it
Challenge
Continue working to polish your app. Add activities that you think would be good additions.

