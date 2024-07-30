# Pinset

## Important Update

Pinset has been promoted as one of the languages of the [Epsilon](https://eclipse.dev/epsilon/) project from the Eclipse Foundation, where it is actively maintained. You can check the current documentation of Pinset [here](https://www.eclipse.dev/epsilon/doc/pinset/).

This repository is only maintained for archival/historical purposes.

## How to cite

```bibtex
@inproceedings{pinset,
  author       = {Alfonso de la Vega and
                  Pablo S{\'{a}}nchez and
                  Dimitrios S. Kolovos},
  editor       = {Antonia Bertolino and
                  Vasco Amaral and
                  Paulo Rupino and
                  Marco Vieira},
  title        = {Pinset: {A} {DSL} for Extracting Datasets from Models for Data Mining-Based
                  Quality Analysis},
  booktitle    = {11th International Conference on the Quality of Information and Communications
                  Technology, {QUATIC} 2018, Coimbra, Portugal, September 4-7, 2018},
  pages        = {83--91},
  publisher    = {{IEEE} Computer Society},
  year         = {2018},
  url          = {https://doi.org/10.1109/QUATIC.2018.00021},
  doi          = {10.1109/QUATIC.2018.00021},
}

```

## Overview

Pinset is a domain specific language that allows to extract two-dimensional datasets from models.
It is implemented atop the [Epsilon](https://www.eclipse.org/epsilon/) platform.

## Requirements

- Epsilon (Interim Update Site). [[link](https://www.eclipse.org/epsilon/download/)]

## Instructions

- Download and import the provided projects into an eclipse workspace.
- Start an eclipse instance in your workspace. Double click any of the projects and select *Run as > Eclipse Application*.
- In the new instance, you will have access to a pinset editor plus creation and configuration wizards. You can find some pinset examples in a separate [repository](https://github.com/alfonsodelavega/pinset-examples).

## Modifying Pinset

If you wish to make modifications to pinset's grammar, you need to download the following projects into the folder that contains this repository:

- Epsilon repository (download the *Users* repository in the Source Code tab). [[link](https://www.eclipse.org/epsilon/download/)]
- Antlr version adapted for Epsilon: [[link](https://github.com/epsilonlabs/epsilon-antlr-dev.git)]

You can recreate the parser by running the ant task *es.unican.istr.pinset.engine/build-pinset-parser.launch*.

## License

Eclipse Public License - v1.0
