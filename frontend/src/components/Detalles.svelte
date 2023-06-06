<script>

import imagenBolaYoga from "../assets/imagenes/esfera-yoga.webp"
import imagenBoxeo1 from "../assets/imagenes/boxeo.jpeg"
import imagenPersonasGimnasio from "../assets/imagenes/personas-gimnasio.jpg"
import imagenMaquinasModernas from "../assets/imagenes/maquinas-modernas.jpg"
import imagenGimnasioModerno from "../assets/imagenes/detallesgimnasio.jpg"
</script>

<section>
    <div>
        <img src={imagenBoxeo1}/>
        <img src={imagenBolaYoga}/>
        <img src={imagenMaquinasModernas}/>
        <img src={imagenPersonasGimnasio}/>
        <img src={imagenGimnasioModerno}/>

    </div>
</section>


<style>
    section {
        width: 100%;
        overflow: hidden;
    }

    div {
        display: flex;
        width: 400px;
        height: 200px;
        transition: transform 0.5s ease-in-out;
    }
</style>