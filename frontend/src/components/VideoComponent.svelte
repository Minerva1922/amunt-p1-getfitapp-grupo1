<script>
    export let src;
    export let controls = true;
</script>

<div>
    <video id="myvideo" src={src} {controls}></video>
</div>


<style>
    div {
        width: 100%;
        margin-bottom: 40px;
    }

   video {
        width: 100%;
        max-height: 400px;
        object-fit: fill;
   }
</style>
