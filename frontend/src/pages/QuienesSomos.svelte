<script>
import Detalles from "../components/Detalles.svelte";
import VideoGetFitEasy from "../assets/video/VideoGetFitEasy.mp4"

</script>
<main>

    <video controls src="../assets/video/VideoGetFitEasy.mp4">

    </video>

    <div class="información">
        <h2>ENTRENA EN EL HORARIO QUE MÁS TE CONVENGA.</h2>
    <button>Únete a nuestro gimnasio</button>
    </div>

    <div class="información">
        <h2>SOMOS UN GIMNASIO DE ALTA CALIDAD DEDICADO A<br> LA SALUD Y AL BIENESTAR QUE OFRECE PRECIOS ACCESIBLES.</h2>
        <p>GetFitEasy es un gimnasio abierto para todos. Ofrecemos programas digitales y presenciales diseñados para ayudarte a lograr tus objetivos de fitness.<br> Descubre todas las ofertas de nuestro club a continuación.</p>
    </div>

    <Detalles />

</main>




<style>
    video {
        width: 100%;
        max-height: 300px;
        margin-bottom: 20px;
    }
    .información{
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
        background-color: white;
        margin-right: 50px;
    }
    button:hover{
        background-color: black;
        color: white;
    }
    p{
        font-size: 17px;
       flex:1;
        margin-left: 250px;
    }
</style>