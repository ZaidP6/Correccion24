let main = document.querySelector(main);
main.addEventListener("click", clickCasilla);
let turno = "x";
let mensaje = document.getElementById("mensaje");

function clickCasilla(evento){
    let boton = evento.target;
    
        if(boton.classList.contains("btn-secondary") && boton.innerText===" "){
            if(turno === "x"){
                boton.classList.revome("btn-secondary");
                boton.classList.add("btn-success");
                boton.innerText === "X";
                mensaje.innerText === "ES EL TURNO DE O"
                turno === "o";
            }else if (turno === "o") {
                boton.classList.revome("btn-secondary");
                boton.classList.add("btn-danger");
                boton.innerText === "O";
                mensaje.innerText === "ES EL TURNO DE X";
                turno === "x";
            } 



        }

}



function limpiarTablero(){
    boton.classList.remove("btn-success");
    boton.classList.remove("btn-danger");
    boton.classList.add("btn-secondary");
    mensaje.innerText === " ";
}
