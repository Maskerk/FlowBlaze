# Controller

This is an implementation of the FlowBlaze Controller based on the [RYU OpenFlow Controller][ryu]. 
This controller can be used with a software implementation (for Linux) that unfortunately could not be realeased in this repository.
We believe that the examples and the OpenFlow protocol extension provide an interesting case study that further clarify the FlowBlaze contributions.
We are working to release the software data plane to be used with this controller, as well as the software agent that works as driver for the NetFPGA FlowBlaze implementation.

## Running

To install the Controller on your machine:

      python ./setup.py install

Once installed, the Controller can be executed using the `ryu-manager` command. Please refer to the [original RYU documentation][ryu] on how to use this controller.

## Extensions & App Samples

Most of the extensions (implemented as *OpenFlow Experimenter Extensions*) are implemented in [ryu/ofproto/beba_v1_0_parser.py](ryu/ofproto/beba_v1_0_parser.py).
App samples can be found inside [ryu/app/beba](ryu/app/beba)

# License
The Controller is released under the Apache 2.0 License.

[ryu]: http://osrg.github.io/ryu
