<script>
import { Link } from '@inertiajs/vue3'

export default {
  components: {
    Link
  }
}
</script>

<template>
  <div class="container">
    <section class="row">
      <h1>Show Contact</h1>
      <ul>
        <li><Link href="/contact/create">New</Link></li>
        <li><Link href="/contact/edit">Edit</Link></li>
      </ul>
    </section>
  </div>
</template>