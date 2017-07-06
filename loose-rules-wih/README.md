# Simple Workitem Handler Template


## To install the WIH

1. Set up your local maven setting to point to guvnor (the BPM maven repository) 
2. Issue `maven deploy`
3. From **Project Editor**:

    - select **Dependenties**
    - click **Add from repository**
    - choose this maven project
     
4. From **Project Editor** open **Deployment Descriptor** and add the new WIH 

    - `TaskInfo`
    - `new taskinfo.wih.TaskInfoWorkItemHandler(runtimeManager)`
`

5. Open Work Item Definitions file and replace the last square bracket with the following 

	  ,
	  [
	    "name" : "TaskInfo",
	    "displayName" : "TaskInfo",
	    "icon" : "defaultservicenodeicon.png"
	  ]
	]

 