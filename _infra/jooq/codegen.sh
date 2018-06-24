#!/bin/bash

#javac -cp "libs/*" -d ./ ../../restaurantmodule/src/main/java/JooqGeneratorStrategy.java

java -cp "libs/*":. org.jooq.codegen.GenerationTool xprssdlvry.xml