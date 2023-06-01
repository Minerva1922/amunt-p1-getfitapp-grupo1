<script>

    import imagenBoxeo from "../assets/servicios/boxeo.jpeg"
    import imagenCardio from "../assets/servicios/cardio.jpeg"
    import imagenEntrenador from "../assets/servicios/entrenador.jpg"
    import imagenGimnasio from "../assets/servicios/gimnasio.jpeg"
    import imagenPesas from "../assets/servicios/pesas.jpg"
    import imagenPiscina from "../assets/servicios/piscina.jpeg"
    import imagenSauna from "../assets/servicios/sauna.jpeg"
    import imagenVestidores from "../assets/servicios/vestidores.jpeg"
    import imagenYoga from "../assets/servicios/yoga.jpeg"
</script>
<main>
    <h1>Nuestros Servicios</h1>

    <section>
        <div>
            <img src={imagenBoxeo}/>
            <p>Boxeo</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenCardio}/>
            <p>Cardio</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenEntrenador}/>
            <p>Entrenador Personal</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenGimnasio}/>
            <p>Gimnasio</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenPesas}/>
            <p>Pesas</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenPiscina}/>
            <p>Piscina</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenSauna}/>
            <p>Sauna</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenVestidores}/>
            <p>Vestidores</p>
            <button>Haz una Reserva</button>
        </div>
        <div>
            <img src={imagenYoga}/>
            <p>Yoga</p>
            <button>Haz una Reserva</button>
        </div>
    </section>
</main>

<style>
    section {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
    }

    div {
        display: grid;
        justify-items: center;
    }
    img {
        border-radius: 5px;
        object-fit: cover;
        width: 250px;
        height: 250px;
    }

    p {
        font-family: 'Roboto Condensed', sans-serif;
        font-weight: bold;
    }

</style>