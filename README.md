# Pinset

Pinset is a domain specific language that allows to extract two-dimensional datasets from models.
It is implemented atop the [Epsilon](https://www.eclipse.org/epsilon/) platform.

## Requirements

- Epsilon 1.5 (Interim Update Site). [[link](https://www.eclipse.org/epsilon/download/)]

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
