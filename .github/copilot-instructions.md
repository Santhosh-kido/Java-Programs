# Copilot instructions for Java-Programs

## Project shape

This repository is a collection of Java practice programs, not a framework-based application. The root folders organize exercises by topic:

- `arrays/` for array manipulation and searching problems
- `string/` for string-processing exercises
- `numberbased/` for digit/number pattern and math problems
- `DSA/` for data-structure and algorithm examples

Most files are standalone Java classes with a `main` method and small example data. The project is intentionally lightweight and does not have a shared runtime, application entry point, dependency injection layer, or service architecture.

## Build, test, and lint commands

There is no Maven, Gradle, or custom build/test/lint setup in this repository.

Use `javac` directly for the file or folder you are working on:

```bash
# Compile and run a single non-package class
javac arrays/ReverseArray.java && java -cp arrays ReverseArray

# Compile and run a package-based example
javac DSA/Two_Pointers/*.java && java -cp . DSA.Two_Pointers.TwoSum

# Compile a full folder if you are intentionally validating all files in it
javac DSA/Linked_List_Data_Structure/*.java
```

For this repo, the practical workflow is usually:

- edit one Java file
- compile just that file or the local folder
- run it with `java` to validate behavior

There is no repository-wide test suite and no lint command to run as a normal CI target.

## Architecture and conventions

- The codebase is topic-first rather than module-first: each folder is a learning area.
- Files are typically self-contained and do not depend on other project classes unless they are intentionally grouped in the same package.
- Class names generally match the file name and use PascalCase.
- Most examples use direct console I/O (`System.out.println(...)`) and hardcoded sample inputs rather than configuration files or external data sources.
- Package declarations are used in some subdirectories (for example `DSA.Two_Pointers` and `DSA.Linked_List_Data_Structure`) to mirror the folder layout.
- The repository favors simple, educational implementations over production patterns, abstraction layers, or reusable libraries.

When adding or modifying code, keep the same pattern as the surrounding folder:

- place new programs in the nearest topical directory
- use a standalone class with a `main` method unless the surrounding area already uses a package structure
- avoid introducing framework dependencies or new project-wide build tooling
- prefer direct sample-driven validation over a larger test harness

## Working style for future sessions

Keep changes minimal and local to the relevant exercise. The repo is a collection of independent examples, so a fix or refactor should normally stay within a single folder or class instead of introducing cross-cutting infrastructure.
