<script setup lang="ts">

import Search from '@/search/Search.vue';

function doSearch(query: string) {
  alert('From parent, do search for: ' + query);
}
</script>

<template>
  <div class="main-container">
    <h1>Book search</h1>
    <search placeholder="Search for books" @onSearch="doSearch"></search>
  </div>
</template>

<style>
.main-container {
  margin: 1rem;
}
</style>

