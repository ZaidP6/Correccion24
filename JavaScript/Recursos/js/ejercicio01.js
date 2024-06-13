let main = document.querySelector("main");
main.addEventListener("click", clickCasilla);
let turno = "x";
let mensaje = document.getElementById("mensaje");

function clickCasilla(evento) {
    let boton = evento.target;

    if (boton.classList.contains("btn-secondary") && boton.tagName === "BUTTON" && boton.innerText === "") {
        if (turno === "x") {
            boton.classList.remove("btn-secondary");
            boton.classList.add("btn-success");
            boton.innerText = "X";
            mensaje.innerText = "ES EL TURNO DE O";
            mensaje.classList.remove("btn-success");
            mensaje.classList.add("btn-danger");
            turno = "o";
        } else if (turno === "o") {
            boton.classList.remove("btn-secondary");
            boton.classList.add("btn-danger");
            boton.innerText = "O";
            mensaje.innerText = "ES EL TURNO DE X";
            mensaje.classList.remove("btn-danger");
            mensaje.classList.add("btn-success");
            turno = "x";
        }
    } else if (boton.innerText !== "") {
        mensaje.innerText = "Casilla ocupada";
        mensaje.classList.remove("btn-success", "btn-danger");
    }
}

function limpiarTablero() {
    let botones = document.querySelectorAll(".btn");
    botones.forEach(boton => {
        if (boton.classList.contains("btn-success") || boton.classList.contains("btn-danger")) {
            boton.classList.remove("btn-success", "btn-danger");
            boton.classList.add("btn-secondary");
            boton.innerText = "";
        }
    });
    turno = "x";
    mensaje.innerText = "ES EL TURNO DE X";
    mensaje.classList.remove("btn-danger");
    mensaje.classList.add("btn-success");
}

let limpiarBtn = document.getElementById("limpiar");
limpiarBtn.addEventListener("click", limpiarTablero);
