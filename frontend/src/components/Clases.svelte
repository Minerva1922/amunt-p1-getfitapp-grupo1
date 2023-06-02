<script>
export let nombre;
export let instructor;
export let sede;
</script>

<div>
    <h1>{nombre}</h1>
    <p>{instructor}</p>
    <p>{sede}</p>
</div>

<style>
    @import url('https://fonts.googleapis.com/css2?family=Anton&display=swap');
    div {
        margin-right: 190px;
        margin-bottom: 28px;
    }
    h1 {
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