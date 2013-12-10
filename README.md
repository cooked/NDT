NDT
===

NREL Development Tools Plugin for Eclipse


## Description

NDT is an user friendly front-end to the wind turbine simulation codes by NREL.

## Features

* Specific editors for FAST, AeroDyn and TurbSim input parameters file
* Chart viewer for the FAST output file.
* Support for single FAST simulation and batch run with ANT (to be completed)

## Installation

* Download and launch [Eclipse](http://www.eclipse.org/) standard platform for your system.
* Add the [NDT update site](http://www.stefanocottafavi.com/eclipse/update/NDT/) to the list of the available update locations and install the plugin.
* Add the [XULRunner update site](http://forge.ispras.ru/repo/xulrunner-eclipse/site/) (this step is REQUIRED on Windows systems with explorer version prior to IE9).

* Setup the default FAST installation location (aka FRE or FAST Runtime Environment): from menu Preferences > NREL > FAST > Installed FREs browse to the folder location on your drive and save.

## Usage

Create a new FAST project from menu File > New > Project...This will generate a set of files that represent the 1.5MW WindPACT baseline wind turbine.

### Single run

* Modify the files as you need.
* Select *.fst file in the Project Explorer view, from the context menu (right click) choose Run As > FAST Simulation to launch the simulation. Check in the Console view the output messages from the running program.
* When the simulation is over refresh the workspace (F5) and open the generated *.out file. This will show the output channels in a grahical viewer (you can zoom and/or hide series).   

![Image](../master/sc.ndt.commons.assets/image/readme_01.png?raw=true)

### Batch run

TBD

