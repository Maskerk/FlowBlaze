# README #

THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE SOFTWARE CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

This repository contains the FlowBlaze prototype for  NetFPGA SUME. 
It should be understood that this prototype is not production ready and
therefore it is provided AS IS, with the user taking full responsibility
for its use.
Furthermore, it should be understood that this prototype is provided 
mainly to foster scientific collaboration and ensure the reproducibility
of the research results.

For the time being, we are not providing contact emails to respect
the double-blind review process of the NSDI conference.
As soon as anonimity will not be anymore required, we will be available
for any question and to provide support for using and extending the
prototype.

As reported in the paper, this prototype uses statecally defined parser, 
action and match tables.
This also means that the number of pipeline elements is fixed.
We already provide sources for pipelines comprising 1, 2 and 5 elements.
It should be relatively easy to extend such sources to an arbitrary 
number of elements.

Network functions are configured at runtime and thus only require writing
the TCAM memory with proper entries. However, it should be noted that
our prototype supports a relatively small number of packet header actions.
Common use cases should not be affected by that.

The prototype has been developed with the Vivado 2016.4 version. We strongly suggest
to use the same version.

To install:

1) Clone the FlowBlaze repo in the $SUME_FOLDER/project directory 

2) recreate the vivado project with the command:

```shell
make project
```

3) create a bitstream wiht the command:

```shell
make
```

