# axonet-fiji
This is an implementation of the AxoNet axon counting software for use in fiji/imageJ.

Installation Instructions:  
1. Download, install, and run Fiji  
2. Add AxoNet and Tensorflow to your update sites    
	-Navigate to "Help > Update..." on the Fiji toolbar
	-Click "Manage update sites"  
	-Scroll down and check "TensorFlow"   
	-Click "Add update site"  
	-Add "http://sites.imagej.net/Mritch3/" to the URL tab, name the new site "AxoNet", and add "webdav:Mritch3" to the Host tab    
	-Close the "manage update sites" window and click "Apply changes"    
3. Restart Fiji/ImageJ  
4. Load an image and run AxoNet!  
	-AxoNet can be found under Plugins on the Fiji toolbar towards the bottom (you may have to scroll down)  



Dependencies: Fiji/ImageJ, la4j, tensorflow java
