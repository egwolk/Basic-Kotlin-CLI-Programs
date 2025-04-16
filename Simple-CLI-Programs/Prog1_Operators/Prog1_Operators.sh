#!/bin/bash
cd "$(dirname "$0")" || exit

java -version >/dev/null 2>&1
if [ $? -ne 0 ]; then
    echo "Can't run program. Please install the JDK first."
    exit 1
fi
java -jar out/artifacts/Prog1_Operators_jar/Prog1_Operators.jar
printf "Press any key to continue..."
read -n 1
