<template>
  <el-input ref="refInput" v-bind="$attrs">
    <template v-for="(_value, name) in $slots" #[name]="slotData">
      <slot :name="name" v-bind="slotData || {}" />
    </template>
  </el-input>
</template>

<script setup lang="ts">
import { getCurrentInstance, onMounted, ref } from "vue";

const refInput = ref();

const instance: any = getCurrentInstance();

onMounted(() => {
  const entries = Object.entries(refInput.value.$.exposed);
  for (const [key, value] of entries) {
    if (instance.exposed) {
      instance.exposed[key] = value;
    }
  }
});
</script>

<style scoped></style>
