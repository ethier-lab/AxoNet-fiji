## AxoNet-fiji Instructions
This is an implementation of the AxoNet axon counting software for use in fiji/imageJ.  

Installation Instructions:  
1. Download, install, and run Fiji: https://fiji.sc/  
	-If you already have Fiji installed, update it to the most recent version  
2. Navigate to **"Help > *Update...**" on the Fiji toolbar to add AxoNet and Tensorflow to your update sites   
	-Click "Manage update sites"  
	-Scroll down and check "TensorFlow"   
	-Click "Add update site"  
	-Add **"http://sites.imagej.net/Mritch3/"** to the URL tab, name the new site **"AxoNet"**, and add **"webdav:Mritch3"** to the Host tab    
	-Close the **"manage update sites"** window and click **"Apply changes"**    
3. Restart Fiji  
4. Load an image by dragging it to the Fiji window.  
	-Your image may be any size!  
5. Find AxoNet under **"Plugins"** on the Fiji toolbar  
	-This may be towards the bottom of the drop-down menu (you may have to scroll down).    
6. Run AxoNet!    



Dependencies: Fiji/ImageJ, la4j, tensorflow java
