# GEnealogical_Data_COMmunication

<div id="top"></div>
Application for parsing GEDCOM file and computing ancestors or descendants of an individual.

GEnealogical_Data_COMmunication is developed for Languages and Compilers Project Exam at University of Camerino.
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#example-potter-family-tree">Example: Potter Family Tree</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
GEnealogical_Data_COMmunication is developed to parse a [GEDCOM](https://en.wikipedia.org/wiki/GEDCOM) file or a stream represents a GEDCOM format.
<br>Lexer generation and in particular Parser generation written with [ANTLR4](https://www.antlr.org/).
<br> Semantics part is written in Java.
<br>The purpose is to:
* execute the parsing of the file or stream
* compute the ancestors or descendants, in according to the request in the GEDCOM file or stream.

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

GEnealogical_Data_COMmunication is developed using:

* [ANTLR4 4.10.1](https://www.antlr.org/) 
* [Java](https://www.java.com/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started
Now you can compute your ancestors and your descendants thanks to  GEnealogical_Data_COMmunication!
<br>In this quickstart guide, you will:
* choose a GEDCOM file in gedTestFiles project directory or write a GEDCOM file.<br>Alternatively you can write your GEDCOM stream on the standard input during program execution
* run the program with the GEDCOM file or stream in input
* see the ancestors or descendants about your request in the GEDCOM file or stream

### Prerequisites

To run GEnealogical_Data_COMmunication only you need is:
* ANTLR4:
 Install ANTLR4 from the official page [Download ANTLR](https://www.antlr.org/download.html)
* Java: Install Java from the offical page [Download Java](https://www.java.com/download/)

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Piermuz7/GEnealogical_Data_COMmunication.git
   ```
   
2. Add ANTLR4 4.10.1 to libraries project

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage
Usage is very simple. You can:
1. Run the program downloading the release:
    ```sh
   java -jar Genealogical_Data_Communication.jar YOUR_FILEPATH
   ```
   or
2. ```sh
   run on your favourite IDE but not forget adding ANTLR4 on your project libraries!

* Remember to press CTRL+D or CTRL+Z at the end of GEDCOM stream if you copy and paste that GEDCOM stream.

<p align="right">(<a href="#top">back to top</a>)</p>

## Example Potter Family Tree

![Potter Family Tree](https://github.com/Piermuz7/GEnealogical_Data_COMmunication/blob/master/img/Potter_family_tree.png)

On this Potter Family tree, notice that there are 7 individuals (HPI01, HPI02, ...) and there are two families: HPF01 and HPF02.
If we want to calculate, for example, ancestors and descendants of Harry Potter, results are the following: 

* Ancestors: 0 ANCE @HPI03@
    ```sh
   HPI01
   HPI02
   HPI03
   ```
* Descendants: 0 DESC @HPI03@
    ```sh
   HPI03
   HPI05
   HPI06
   HPI07
   ```
Notice that the order of a set of ancestors or descendants it is not important.
Moreover, for GEDCOM definition, an individual is an ancestor and a descendant of itself.
In Potter Family tree, the individual with CODE @HPI03@, so Harry Potter is an ancestor and a descendant of himself.
Harry Potter's ancestors are James Potter (HPI02) and Lily Evans Potter (HPI01) and Harry Potter (HPI03) 
while his descendants are: James Sirius Potter (HPI05), Albus Severus Potter (HPI06), Lily Luna Potter (HPI07) and Harry Potter (HPI03).

<!-- ROADMAP -->
## Roadmap

- [x] GEDCOM Grammar
- [X] Walker pattern
- [X] Ancestors and descendants computing

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Piermichele Rosati - piermichele.rosati@gmail.com

Project Link: [https://github.com/Piermuz7/GEnealogical_Data_COMmunication](https://github.com/Piermuz7/GEnealogical_Data_COMmunication)

<p align="right">(<a href="#top">back to top</a>)</p>
