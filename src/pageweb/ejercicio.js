console.log("hola")
const getData = () => {
    let cargador = document.getElementById("Cargando")
    let info = document.getElementById("info")
    cargador.classList.remove("ocultar")
    info.classList.add("ocultar")
   fetch("https://jsonplaceholder.typicode.com/users")
       .then(res => res.json())
       .then(data => {
           let body= document.getElementById("body")
           let a = ``;
           data.forEach(element => {
               a += ` 
                    <tr>
                        <td> ${element["id"]}</td> 
                        <td> ${element["name"]}</td>
                        <td> ${element["phone"]}</td>
                        <td> ${element["username"]}</td>  
                        <td> ${element["website"]}</td>
                    </tr>
               `
           })
           body.innerHTML = a
           cargador.classList.add("ocultar")
           info.classList.remove("ocultar")

       })



}
document.getElementById("data")
    .addEventListener("click", getData);

