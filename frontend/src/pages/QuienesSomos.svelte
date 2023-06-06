<script>
import Detalles from "../components/Detalles.svelte";
import VideoGetFitEasy from "../assets/video/VideoGetFitEasy.mp4"
import VideoComponent from "../components/VideoComponent.svelte";
import ServiciosAdicionales from "../components/ServiciosAdicionales.svelte";
import Direccion from "../components/Direccion.svelte";

</script>
<main>

    <VideoComponent src={VideoGetFitEasy} controls />
    <div>
        <h2>ENTRENA EN EL HORARIO QUE MÁS TE CONVENGA.</h2>
    <button>Únete a nuestro gimnasio</button>
    </div>

    <div>
        <h2>SOMOS UN GIMNASIO DE ALTA CALIDAD DEDICADO A<br> LA SALUD Y AL BIENESTAR QUE OFRECE PRECIOS ACCESIBLES.</h2>
        <p>GetFitEasy es un gimnasio abierto para todos. Ofrecemos programas digitales y presenciales diseñados para ayudarte a lograr tus objetivos de fitness.<br> Descubre todas las ofertas de nuestro club a continuación.</p>
    </div>

    <Detalles />
    <ServiciosAdicionales />

    <article>
        <h2>“GetFitEasy fue fundamental para ayudarme a obtener la figura esbelta que tanto anhelaba.”</h2><br>
        <p>-Elena Sandoval-</p>
    </article>
    <Direccion />

</main>

<style>

    div{
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 30px;
        margin-bottom: 40px;
    }
    button {
        margin-top: 50px;
        width: 200px;
        height: 60px;
        border-radius: 30px;
        border: none;
        background: linear-gradient(to bottom, #c1ffc1, #87ceeb);
        margin-right: 50px;
    }

    p{
        font-size: 17px;
        flex:1;
        margin-left: 250px;
    }
    article {
        background: linear-gradient(to bottom, #c1ffc1, #87ceeb);
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 30vh;
        text-align: center;
    }

    article h2 {
        font-size: 30px;
        margin-top: 60px;
    }

    article p {
        margin: 10px 0 0;
        font-size: 18px;
    }




</style>