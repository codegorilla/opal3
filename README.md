

Generate:

```
$ antlr Opal.g4
```

Compile:

```
$ javac -cp /opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar Opal*.java
```

Test:

```
$ grun Opal prog -tree
```

Test (GUI):

```
$ grun Opal prog -gui
```

${project.build.directory}/generated-sources/antlr4


> Note: To allow IntelliJ to not show errors in Main.java, I needed to click "Generate Sources and Update Folders" in Maven pane to the right.

