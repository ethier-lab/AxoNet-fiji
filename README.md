# AxoNet-fiji Instructions
This is an implementation of the AxoNet axon counting software for use in fiji/imageJ.  
AxoNet is intended for use in optic nerve images obtained by light microscope at 100x mag.  
AxoNet has been validated for use in NHP and rat optic nerves.  

AxoNet produces axon count estimates with high accuracy and is robust to image quality and nerve damage in models of glaucoma. We used deep learning to train our tool to estimate a pixelwise axon count density, which we integrate across the full image to calculate an axon count.  


## Installation:  

1. Download, install, and run Fiji [here](https://fiji.sc/).    
	- If you already have Fiji installed, update it to the most recent version  
	  
2. Navigate to **"Help > "Update..."** on the Fiji toolbar to add AxoNet and Tensorflow to your update sites   
	- *If this triggers automatic updates, wait for them to load. Restart Fiji when prompted __before starting step 2 again__*  
	- Click **"Manage update sites"**  
	- Scroll down and click the check box next to **"AxoNet"**   
	- Scroll down and click the check box next to **"TensorFlow"**   
	- Close the **"manage update sites"** window and click **"Apply changes"**    
	
3. Restart Fiji  
  

## Use:  

1. Load an image by dragging its file to the Fiji window.  
	- Your image may be any size or shape!  
	- If you are processing a full nerve or an image with background, **do the following**:
		- Use **Polygon selections** or **Freehand selections** to select your entire nerve
		- Click **"Image" > "Crop"** on the Fiji toolbar to crop the image to your selection
		- Click **"Edit" > "Clear Outside"** on the Fiji toolbar to make all non-nerve image regions black
		- Close other programs you have open and are not using  
			
2. Find AxoNet in the bottom of the **"Analyze"** menu on the Fiji toolbar  
	- This is towards the bottom of the drop-down menu.    
 	- Click **AxoNet** to run!  
	
3. Monitor the **Console** window for the program's message log  
  
4. Read **"AxoNet Output Explanation.pdf"** in the repository to interpret your results  
  
Note: You may also install AxoNet by manually adding the contents of the "jar files" folder of this repository to the plugins folder inside your Fiji/ImageJ folder


### Dependencies:  
[Fiji/ImageJ](https://fiji.sc/), [la4j](http://la4j.org/), [Tensorflow for Java](https://www.tensorflow.org/install/lang_java)  
(These should be handled if you follow the above installation)


## Notice
This work is licensed under a Apache 2.0 license.  

Users at for-profit commercial organizations are requested to provide a donation, in an amount of their choice, to  support the wonderful work of the [National Glaucoma Research Program of the BrightFocus Foundation](https://www.brightfocus.org).  
Users in the non-profit sector, i.e. at academic, foundation and governmental organizations, are requested to consider a similar donation.   

If you publish papers using this software, please cite this [preprint](https://arxiv.org/abs/1908.02919).  
This tool was developed by the Ethier Lab of the Georgia Institute of Technology.  
