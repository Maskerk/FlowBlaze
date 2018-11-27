# Getting started

### Building the compiler
In order to build the xtrac compiler, you need to install [Maven](https://maven.apache.org/) first. Visit [this page](https://maven.apache.org/install.html) for the Maven installation instructions.

After this, you can build the compiler jar file (*xtrac.jar*), just with the `make` command.

### Compiling an *XTRA Lang* file
For compiling an *XTRA Lang* file, to obtain the JSON representation of the XFSM, you need to use the command

`java -jar xtrac.jar -i input_file.xtra -o output_file.json`