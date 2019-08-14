# Wireframe Conversion

## Introduction
Take a (very) rough wireframe drawing and other provided assets to build the UI for a simple news reader app.

## Objectives
- [ ] understand the main tenets of Material Design
- [ ] build layouts with proper spacing
- [ ] use color to improve app design
- [ ] translate wireframes into Android designs

## Instructions

### Plan out the UI
1. Download all the assets
2. Review the wireframe 
2. Look at the color scheme at this link https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=3F51B5&secondary.color=80DEEA
3. Review the other assets
4. With the rough wireframe as your foundation, using your favorite tool, draw out the three activities for your app. Use the principles discussed in this module when laying out the components.
5. Make as many annotations as possible, the more you make, the easier it will be to build the layouts in the code.
> Note element sizes, spacing, color, approximate font size (small, medium, bold)

### Build Resources
1. Add the color resources from the provided `colors.xml` to your color resources
2. Use the tools discussed this week and the colors provided to create your own logo
3. Generate other image assets with your 

### Login Page
1. Add two edit text views as well as sign in and register buttons
2. Arrange the buttons, size them, add margins and padding to match the design you built
3. Add coloring to match your design
4. In your Kotlin file, add a simple listener to the sign in button to launch a second activity

### List Page
> In order to limit the amount of code we have to write for this mockup, we're going to use a scrollview and some imageviews to layout out this page. In a real app, you'd use a recycler view for this.

1. Build a top level scroll view with nested view groups and image views to place the images where they belong. Mix in some double wide images for variety.
> You can add titles to the images as well to improve your UI

2. Adjust spacing to match the principles taught as well as your design
3. Add a listener to each of the imageviews to move to a detail view
> This can be done by writing a single method and passing it an image to add to the intent

### Detail Page
1. Build the detail page with an imageview, title text and body text. This will need to scroll to allow for larger bodies of text.
2. Remember to use margins, key lines and to count the number of characters in your text block to get it

## Challenge
Continue working to polish your app. Add activities that you think would be good additions.
