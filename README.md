

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
$ grum Opal prog -gui
```

${project.build.directory}/generated-sources/antlr4