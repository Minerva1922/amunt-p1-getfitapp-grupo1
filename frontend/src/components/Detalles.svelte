<script>

import imagenGimnasio from "../assets/imagenes/gimnasio.jpeg"
import imagenBolaYoga from "../assets/imagenes/esfera-yoga.webp"
import imagenMaquinas from "../assets/imagenes/maquinas.jpg"
import imagenPersonasGimnasio from "../assets/imagenes/personas-gimnasio.jpg"
import imagenMaquinasModernas from "../assets/imagenes/maquinas-modernas.jpg"
import imagenGimnasioModerno from "../assets/imagenes/detallesgimnasio.jpg"
</script>

<div class="carousel-container">
    <div class="carousel">
      <!--<img src={imagenGimnasio}/>-->
        <img src={imagenBolaYoga}/>
        <img src={imagenMaquinasModernas}/>
        <img src={imagenPersonasGimnasio}/>
        <img src={imagenMaquinas}/>
        <img src={imagenGimnasioModerno}/>

    </div>
</div>


<style>
    .carousel-container {
        width: 100%;
        overflow: hidden;
    }

    .carousel {
        display: flex;
        width: 400px;
        height: 200px;
        transition: transform 0.5s ease-in-out;
    }
</style>