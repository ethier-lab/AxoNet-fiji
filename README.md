# axonet-fiji
This is an implementation of the AxoNet axon counting software for use in fiji/imageJ.

Installation Instructions:  
1. Download, install, and run Fiji  
2. Add Tensorflow to your update sites    
  -Navigate to "Help > Update..." on the Fiji toolbar  
  -Click "Manage update sites"  
  -Scroll down and check "TensorFlow"  
  -Click "Apply Changes"  
3. Download "AxoNet-0.1.0.jar" from this repository  
4. Download "la4j-0.6.0.jar" from https://repo1.maven.org/maven2/org/la4j/la4j/0.6.0/la4j-0.6.0.jar or this repository  
5. Navigate to "Plugins > Install PlugIn..." on the Fiji toolbar  
6. Install both the AxoNet and la4j jars  
7. Restart Fiji  
8. Load an image and run AxoNet!  
	-AxoNet can be found under Plugins on the Fiji toolbar towards the bottom (you may have to scroll down)  


Dependencies: Fiji/ImageJ, la4j, tensorflow java