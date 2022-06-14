<script setup lang="ts">

import {reactive} from 'vue';
import {SearchModel} from '@/search/SearchModel';

const props = defineProps({
  placeholder: String,
});

const emits = defineEmits(['onSearch']);

const searchModel = reactive(new SearchModel());


function search() {
  emits('onSearch', searchModel.query);
}
</script>

<template>
  <input type="text" v-model="searchModel.query" v-bind:placeholder="props.placeholder">
  <button v-on:click="search">Search for {{ searchModel.query }}</button>
</template>

<style>
</style>
