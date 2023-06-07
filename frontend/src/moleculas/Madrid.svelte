<script>

    let info;

</script>
<div>

    <div on:click|preventDefault={irAMadrid}>
        <h3>{info.nombre}</h3>
        <p>{info.direccion} ({info.suscripcion}) ({info.telefono})({info.email})</p>
    </div>

</div>

<style>
div {
    margin-right: 190px;
    margin-bottom: 28px;
}
h3 {
    text-align: justify;
    font-size: 35px;
    font-weight: 900;
    color: #254e5f;
}

p {
    display: flex;
    color: #254e5f;
}

</style>