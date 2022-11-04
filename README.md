# ParcialElectivaII

Integrantes: WILLIN STIVEN FUENTES LADINO, KEVIN NICOLAS PATIÑO SAENZ

BAse de datos en la nube. PEro no se pudo subir el archivo toca descargar en local



# CREAR ESTUDIANTE
http://localhost:8080/student METODO POST

body
{
    "id_student": 1,
    "last_name": "wiilin",
    "name": "willin",
    "birthday": "2022-01-01",
    "phone": "320"
}

# EDITAR ESTUDIANTE METODO PUT
http://localhost:8080/student

body
{
    "id_student": 1,
    "last_name": "wiilin",
    "name": "willin",
    "birthday": "2022-01-01",
    "phone": "320"
}

# ELIMINA ESTUDIANTE METODO DELETE
http://localhost:8080/student/1

# MOSTRAR UN ESTUDIANTE GET 
http://localhost:8080/student/1

# MOSTRAR ESTUDIANTES GET 
http://localhost:8080/student

# MOSTRAR MATERIAS DE UN ESTUDIANTE  METODO GET
http://localhost:8080/student/matter/2

# AGREGAR MATERIA A ESTUDIANTE METODO POST
http://localhost:8080/student/1/matter/2

# --------

# CREAR MATERIA METDO POST
http://localhost:8080/matter

body
{
    "code": 2,
    "description": "Informatica",
    "cedits": "4"
}

# EDITAR MATERIA METODO PUT
http://localhost:8080/matter
body
{
    "code": 2,
    "description": "Informatica",
    "cedits": "4"
}

# ELIMINAR MATERIA METODO DELETE
http://localhost:8080/matter/1

# MOSTRAR UNA MATERIA METODO GET
http://localhost:8080/matter/1

# MOSTRAR MATERIAS METODO GET
http://localhost:8080/matter


