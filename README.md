##ShapeOverlap Project

#Import project using Git uri
#Update maven
#Run springboot application

#Find DB details in application.properties files

#H2 in-mermory database is used(http://localhost:8080/h2-console)

##Endpoint

#-localhost:8080/getShapes

#-localhost:8080/addShape

##input json example mentioned below to add shape

{
        "type": "Square",
        "x1": 1,
        "y1": 0,
        "x2": 2,
        "y2": 1
}

#type is type of shape
#(x1,y1)(x2,y2) are geometry coordinates.

##output
#202 Accepted for Accepted shape
#404 for not acceptable overlapping square shape
