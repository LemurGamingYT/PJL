from os import listdir

for file in listdir("core/gen/"):
    file = "core/gen/" + file

    if file.endswith(".java"):
        lines = []
        with open(file, "r") as fp:
            lines = fp.readlines()
            lines[0] = "package core.gen;\n"
        
        with open(file, "w") as fp:
            fp.writelines(lines)
