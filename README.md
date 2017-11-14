# SpringWebAnuncio
Trabajo diciembre


Limpiar archivos temporales (GNU/Linux)

$IFS="

"

$for x in $( sed '/\#/d' < .gitignore | sed '/\!/d' | sed '/^$/d'); do rm -rfv "$x"; done
