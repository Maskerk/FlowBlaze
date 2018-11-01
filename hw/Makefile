################################################################################
# Vivado Launch Script
################################################################################

.PHONY: clean all

all: 
	vivado -mode tcl -source tcl/make.tcl

project: 
	vivado -mode tcl -source tcl/create_project.tcl

wipe:   clean	
	rm -rfv  FlowBlaze.xpr
	rm -rfv  FlowBlaze.srcs/
	rm -rfv  FlowBlaze.ip_user_files/
	rm -rfv  FlowBlaze.sim/ 
clean:	
	rm -rfv vivado*
	rm -rfv *.log
	rm -rfv .Xil
	rm -rfv webtalk*
	rm -rfv *.*~
	rm -rfv ip_repo
	rm -rfv ip_proj
	rm -rfv *.cache 
	rm -rfv *.hw 
	rm -rfv *.runs 
