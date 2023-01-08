@echo off
antlr4 -o core/gen/ core/PJL.g4 -visitor -no-listener
