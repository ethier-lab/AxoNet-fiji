# AxoNet-fiji Instructions
This is an implementation of the AxoNet axon counting software for use in fiji/imageJ.  
AxoNet is intended for use in optic nerve images obtained by light microscope at 100x mag. AxoNet has been validated for use in NHP and rat optic nerves.

AxoNet produces axon count estimates with high accuracy and is robust to image quality and nerve damage in models of glaucoma. We used deep learning to train our tool to estimate a pixelwise axon count density, which we integrate across the full image to calculate an axon count.


## Installation and Use:  

1. Download, install, and run Fiji [here](https://fiji.sc/).  
	-If you already have Fiji installed, update it to the most recent version  
	
2. Navigate to **"Help > "Update..."** on the Fiji toolbar to add AxoNet and Tensorflow to your update sites   
	-If this triggers automatic updates, wait for them to load and restart Fiji when prompted before starting step 2 again  
	-Click "Manage update sites"  
	-Scroll down and click the check box next to **"TensorFlow"**   
	-Click **"Add update site"**  
		-Add **"http://sites.imagej.net/Mritch3/"** to the URL tab  
		-Double click on the **"Name"** field and name the new site **"AxoNet"**  
		-Double click on the **"Host"** field and enter the host as **"webdav:Mritch3"**  
	-Close the **"manage update sites"** window and click **"Apply changes"**    
	
3. Restart Fiji  

4. Load an image by dragging its file to the Fiji window.  
	-Your image may be any size!  
	
5. Find AxoNet in the bottom of the **"Analyze"** menu on the Fiji toolbar  
	-This is towards the bottom of the drop-down menu.    
 	-Click **AxoNet** to run!  
	
6. Monitor the **Console** window for the program's message log  
  
7. Read **"AxoNet Output Explanation.pdf"** in the repository to interpret your results


### Dependencies:  
Fiji/ImageJ, la4j, tensorflow java  
(These should be handled if you follow the above installation)
