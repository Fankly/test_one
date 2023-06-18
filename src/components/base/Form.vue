<script lang="ts" setup>
import FormItem from "@/base/FormItem.vue";
import type { FormItems } from "@/types/formData";

const props = defineProps<FormItems>();

defineExpose({
  props
});
</script>

<template>
  <el-form v-bind="$attrs">
    <FormItem
      v-for="(col, index) in formItems"
      :key="col.prop || col.name || index"
    >
      <template v-for="(_value, name) in $slots" #[name]="slotData">
        <slot :name="name" v-bind="slotData || {}"></slot>
      </template>
    </FormItem>
  </el-form>
</template>

<style scoped></style>
